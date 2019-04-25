package containment;

public class Certificate {

	private String name;
	private String grade;
	private String institution;

	public Certificate() {

	}

	public Certificate(String name, String grade, String institution) {
		super();
		this.name = name;
		this.grade = grade;
		this.institution = institution;
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

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	void print() {
		System.out.println("Institution Name=" + institution);
		System.out.println("Certificate Name=" + name);
		System.out.println("Certificate Grade=" + grade);
	}

}
