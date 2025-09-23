package com.itp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itp.dbcon.MySQLDBConnectionJune;
import com.itp.model.Student;

@Repository
public class StudentRepository 
{
	
	public void insertStudent(Student student) throws Exception
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		String query="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, student.getRno());
		ps.setString(2, student.getSname());
		ps.setDouble(3, student.getPer());
		
		int rows=ps.executeUpdate();
		if(rows>0)
			System.out.println(rows + " Records Inserted");
		else
			System.out.println("no record inserted");
		
		ps.close();
		con.close();
	}

	public List<Student> allStudent() throws Exception
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		Statement st=con.createStatement();

		String query="select * from student";
		
		ResultSet rs=st.executeQuery(query);
		List<Student> students=new ArrayList();
		while(rs.next())
		{
			students.add(new Student(rs.getInt("rno"),rs.getString("studname"),rs.getDouble("studper")));
		}
		
		rs.close();
		st.close();
		con.close();
		
		return students;
	}

	public void deleteStudent(int rno) throws Exception
	{
		Connection con=MySQLDBConnectionJune.getConnection();
		
		String query="delete from student where rno=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, rno);
		
		
		int rows=ps.executeUpdate();
		
		ps.close();
		con.close();
		
	}
	

}
