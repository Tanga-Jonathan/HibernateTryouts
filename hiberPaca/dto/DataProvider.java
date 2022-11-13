package hiberPaca.dto;
import java.util.Date;

import javax.persistence.*;

@Entity 
public class DataProvider {
private String Name;
@Id
private int Id;
private Date thatDay;
private String Description;
private String Report;



public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Date getThatDay() {
	return thatDay;
}
public void setThatDay(Date thatDay) {
	this.thatDay = thatDay;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getReport() {
	return Report;
}
public void setReport(String report) {
	Report = report;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
}
