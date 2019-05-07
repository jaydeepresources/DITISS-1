package assignment;

public class Certificate {

	private int id;
	private String name;
	private String grade;

	public Certificate() {

	}

	public Certificate(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
