package com.trumanliu.action;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHeader;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trumanliu.domain.Student;
import com.trumanliu.service.ArticleService;
import com.trumanliu.service.StudentService;

public class Main extends ActionSupport implements ModelDriven<Student>,SessionAware{
	private static final long serialVersionUID = -1881595708877090922L;
	private Map<String, Object> session;
	private Student student = new Student();
	private StudentService stus;
	private ArticleService articleService;
	
	
	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public StudentService getStus() {
		return stus;
	}
	public void setStus(StudentService stus) {
		this.stus = stus;
	}
	public Student getModel() {	
		return student;
	}
	public String checkLogin(){
		Student stu = stus.getStudent(student);
		System.out.println(stu.getPassword());
		System.out.println(stu.getPassword());
		System.out.println(stu.getRealname());
		System.out.println(stu.getEmail());
		if(stu!=null && (stu.getPassword().equals(student.getPassword()))){
			modifySession(stu);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	
	public String register() {
		return "register";
	}
	
	public String myhome(){
		return "home";
	}
	public String logout(){
		session.clear();
		return "logout";
	}
	
	public void modifySession(Student stu){
		System.out.println("modify");
		this.session.put("stu", stu);
	}
	public String export(){
		/**
		*如果是从数据库里面取数据，就让studentList=取数据的函数：
		*就没必要下面的for循环
		             *我下面的for循环就是手动给studentList赋值
		             */
		List<Student> studentList = stus.getAllStudents();
		String[] tableHeader = { "学号","姓名","性别","电话","邮箱" };
		short cellNumber = (short) tableHeader.length;// 表的列数
		HSSFWorkbook workbook = new HSSFWorkbook(); // 创建一个excel
		HSSFCell cell = null; // Excel的列
		HSSFRow row = null; // Excel的行
		HSSFCellStyle style = workbook.createCellStyle(); // 设置表头的类型
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		HSSFCellStyle style1 = workbook.createCellStyle(); // 设置数据类型
		style1.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		HSSFFont font = workbook.createFont(); // 设置字体
		HSSFSheet sheet = workbook.createSheet("sheet1"); // 创建一个sheet
		HSSFHeader header = sheet.getHeader();// 设置sheet的头
		try {
			/**
			 * 根据是否取出数据，设置header信息
			 * 
			 */
			if (studentList.size() < 1) {
				header.setCenter("查无资料");
			} else {
				header.setCenter("学生表");
				row = sheet.createRow(0);
				row.setHeight((short) 400);
				for (int k = 0; k < cellNumber; k++) {
					cell = row.createCell(k);// 创建第0行第k列
					cell.setCellValue(tableHeader[k]);// 设置第0行第k列的值
					sheet.setColumnWidth(k, 8000);// 设置列的宽度
					font.setColor(HSSFFont.COLOR_NORMAL); // 设置单元格字体的颜色.
					font.setFontHeight((short) 350); // 设置单元字体高度
					style1.setFont(font);// 设置字体风格
					cell.setCellStyle(style1);
				}
				/*
				 * // 给excel填充数据这里需要编写
				 */
				for (int i = 0; i < studentList.size(); i++) {
					Student student = (Student) studentList.get(i);// 获取student对象
					row = sheet.createRow((short) (i + 1));// 创建第i+1行
					row.setHeight((short) 400);// 设置行高

					if (student.getStuid() != null) {
						cell = row.createCell(0);// 创建第i+1行第0列
						cell.setCellValue(student.getStuid());// 设置第i+1行第0列的值
						cell.setCellStyle(style);// 设置风格
					}
					if (student.getRealname() != null) {
						cell = row.createCell(1); // 创建第i+1行第1列

						cell.setCellValue(student.getRealname());// 设置第i+1行第1列的值

						cell.setCellStyle(style); // 设置风格
					}
					// 由于下面的和上面的基本相同，就不加注释了
					if (student.getGender() != null) {
						cell = row.createCell(2);
						cell.setCellValue(student.getGender());
						cell.setCellStyle(style);
					}
					if (student.getTele() != null) {
						cell = row.createCell(3);
						cell.setCellValue(student.getTele());
						cell.setCellStyle(style);
					}
					if (student.getEmail() != null) {
						cell = row.createCell(4);
						cell.setCellValue(student.getEmail());
						cell.setCellStyle(style);
					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 下面的可以不用编写，直接拷贝
		 */
		HttpServletResponse response = null;// 创建一个HttpServletResponse对象
		OutputStream out = null;// 创建一个输出流对象
		try {
			response = ServletActionContext.getResponse();// 初始化HttpServletResponse对象
			out = response.getOutputStream();//
			response.setHeader("Content-disposition", "attachment; filename="
					+ "student.xls");// filename是下载的xls的名，建议最好用英文
			response.setContentType("application/msexcel;charset=UTF-8");// 设置类型
			response.setHeader("Pragma", "No-cache");// 设置头
			response.setHeader("Cache-Control", "no-cache");// 设置头
			response.setDateHeader("Expires", 0);// 设置日期头
			workbook.write(out);
			out.flush();
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				if (out != null) {
					out.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return null;


		
	}
	public String execute(){
		List<String> titles = articleService.getTitles();
		for (String string : titles) {
			System.out.println(string);
		}
		return SUCCESS;
	}



}
