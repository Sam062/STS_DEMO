package com.app;

public class Trial {
	private int sid;
	private float sal;
	private String name;
	public Trial() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(sal);
		result = prime * result + sid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trial other = (Trial) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(sal) != Float.floatToIntBits(other.sal))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Trial [sid=" + sid + ", sal=" + sal + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
