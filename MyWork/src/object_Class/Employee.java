package object_Class;

public class Employee {
	int id;
	String name;
//	double sal;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.sal = sal;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(sal);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
//			return false;
//		return true;
//	}

	public int hashCode() {
//		return id + Dummy.getHashCode(name);
		System.out.println();
		System.out.println(name.hashCode());
		return id+name.hashCode();
	}

//	public boolean equals(Object o) {
//		Employee obj = (Employee) o;
//		return this.id == obj.id && this.name == obj.name && this.sal == obj.sal;
//	}

}
