package kk.model;

public class Word {
	private Integer id;
	private String nameEng;
	private String translations;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getTranslations() {
		return translations;
	}

	public void setTranslations(String translations) {
		this.translations = translations;
	}

	@Override
	public String toString() {
		return "Word [id=" + id + ", nameEng=" + nameEng + ", translations=" + translations + "]";
	}

}
