package contact;

import com.xero.model.AddressType;

public class LocalAddress {
	private AddressType localAddressType;
	private String localAddressLine1;
	private String localCity;
	private String localRegion;
	private String localPostalCode;
	private String localCountry;
	
	public LocalAddress(){
		
	}

	public LocalAddress(AddressType localAddressType, String localAddressLine1, String localCity,
			String localRegion, String localPostalCode, String localCountry) {
		super();
		this.localAddressType = localAddressType;
		this.localAddressLine1 = localAddressLine1;
		this.localCity = localCity;
		this.localRegion = localRegion;
		this.localPostalCode = localPostalCode;
		this.localCountry = localCountry;
	}

	public AddressType getLocalAddressType() {
		return localAddressType;
	}

	public void setLocalAddressType(AddressType localAddressType) {
		this.localAddressType = localAddressType;
	}

	public String getLocalAddressLine1() {
		return localAddressLine1;
	}

	public void setLocalAddressLine1(String localAddressLine1) {
		this.localAddressLine1 = localAddressLine1;
	}

	public String getLocalCity() {
		return localCity;
	}

	public void setLocalCity(String localCity) {
		this.localCity = localCity;
	}

	public String getLocalRegion() {
		return localRegion;
	}

	public void setLocalRegion(String localRegion) {
		this.localRegion = localRegion;
	}

	public String getLocalPostalCode() {
		return localPostalCode;
	}

	public void setLocalPostalCode(String localPostalCode) {
		this.localPostalCode = localPostalCode;
	}

	public String getLocalCountry() {
		return localCountry;
	}

	public void setLocalCountry(String localCountry) {
		this.localCountry = localCountry;
	}

	@Override
	public String toString() {
		return "LocalAddress [localAddressType=" + localAddressType + ", localAddressLine1=" + localAddressLine1
				+ ", localCity=" + localCity + ", localRegion=" + localRegion + ", localPostalCode=" + localPostalCode
				+ ", localCountry=" + localCountry + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localAddressLine1 == null) ? 0 : localAddressLine1.hashCode());
		result = prime * result + ((localAddressType == null) ? 0 : localAddressType.hashCode());
		result = prime * result + ((localCity == null) ? 0 : localCity.hashCode());
		result = prime * result + ((localCountry == null) ? 0 : localCountry.hashCode());
		result = prime * result + ((localPostalCode == null) ? 0 : localPostalCode.hashCode());
		result = prime * result + ((localRegion == null) ? 0 : localRegion.hashCode());
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
		LocalAddress other = (LocalAddress) obj;
		if (localAddressLine1 == null) {
			if (other.localAddressLine1 != null)
				return false;
		} else if (!localAddressLine1.equals(other.localAddressLine1))
			return false;
		if (localAddressType != other.localAddressType)
			return false;
		if (localCity == null) {
			if (other.localCity != null)
				return false;
		} else if (!localCity.equals(other.localCity))
			return false;
		if (localCountry == null) {
			if (other.localCountry != null)
				return false;
		} else if (!localCountry.equals(other.localCountry))
			return false;
		if (localPostalCode == null) {
			if (other.localPostalCode != null)
				return false;
		} else if (!localPostalCode.equals(other.localPostalCode))
			return false;
		if (localRegion == null) {
			if (other.localRegion != null)
				return false;
		} else if (!localRegion.equals(other.localRegion))
			return false;
		return true;
	}
	
	

}
