package Inbuild_Libraries;

public class Car {
String bN;
double tS;
double price;
public Car(String bN, double tS, double price) {
	super();
	this.bN = bN;
	this.tS = tS;
	this.price = price;
}
//@Override
//public String toString() {
//	return "Car [bN=" + bN + ", tS=" + tS + ", price=" + price + "]";
//}
//@Override
//public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + ((bN == null) ? 0 : bN.hashCode());
//	long temp;
//	temp = Double.doubleToLongBits(price);
//	result = prime * result + (int) (temp ^ (temp >>> 32));
//	temp = Double.doubleToLongBits(tS);
//	result = prime * result + (int) (temp ^ (temp >>> 32));
//	return result;
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Car other = (Car) obj;
//	if (bN == null) {
//		if (other.bN != null)
//			return false;
//	} else if (!bN.equals(other.bN))
//		return false;
//	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//		return false;
//	if (Double.doubleToLongBits(tS) != Double.doubleToLongBits(other.tS))
//		return false;
//	return true;
//}
//public boolean equals(Object obj) {
//	Car temp=(Car)obj;
//	return this.bN==temp.bN&&this.tS==temp.tS&&this.price==this.price;
//}

}
