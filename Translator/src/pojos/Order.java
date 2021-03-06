package pojos;
import java.util.Date;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
public class Order {
	
	Long id;
	String user;
	String source;
	List<String> target;
	String type;
	String theme;
	Long symb;
	Date formed;
	Date finished;
	FileItem file;
	
	public FileItem getFile() {
		return file;
	}
	public void setFile(FileItem file) {
		this.file = file;
	}
	public void setSymb(Long symb) {
		this.symb = symb;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<String> getTarget() {
		return target;
	}
	public void setTarget(List<String> target) {
		this.target = target;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public long getSymb() {
		return symb;
	}
	public void setSymb(long symb) {
		this.symb = symb;
	}
	public Date getFormed() {
		return formed;
	}
	public void setFormed(Date formed) {
		this.formed = formed;
	}
	public Date getFinished() {
		return finished;
	}
	public void setFinished(Date finished) {
		this.finished = finished;
	}
	public Order(String source, List<String> target, String theme, String type) {
		this.source = source;
		this.target = target;
		this.type = type;
		this.theme = theme;
	}
	public Order(){
		
	}
	
}
