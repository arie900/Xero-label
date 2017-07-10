package contact;

public class LocalPhone {
	
	private String localPhoneNumber;
	private String localAreaCode;
	private String localCountryCode;
	
	public LocalPhone(){
		
	}

	public LocalPhone(String localPhoneNumber, String localAreaCode, String localCountryCode) {
		super();
		this.localPhoneNumber = localPhoneNumber;
		this.localAreaCode = localAreaCode;
		this.localCountryCode = localCountryCode;
	}

	public String getLocalPhoneNumber() {
		return localPhoneNumber;
	}

	public void setLocalPhoneNumber(String localPhoneNumber) {
		this.localPhoneNumber = localPhoneNumber;
	}

	public String getLocalAreaCode() {
		return localAreaCode;
	}

	public void setLocalAreaCode(String string) {
		this.localAreaCode = string;
	}

	public String getLocalCountryCode() {
		return localCountryCode;
	}

	public void setLocalCountryCode(String string) {
		this.localCountryCode = string;
	}

	@Override
	public String toString() {
		return "LocalPhone [localPhoneNumber=" + localPhoneNumber + ", localAreaCode=" + localAreaCode
				+ ", localCountryCode=" + localCountryCode + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localAreaCode == null) ? 0 : localAreaCode.hashCode());
		result = prime * result + ((localCountryCode == null) ? 0 : localCountryCode.hashCode());
		result = prime * result + ((localPhoneNumber == null) ? 0 : localPhoneNumber.hashCode());
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
		LocalPhone other = (LocalPhone) obj;
		if (localAreaCode == null) {
			if (other.localAreaCode != null)
				return false;
		} else if (!localAreaCode.equals(other.localAreaCode))
			return false;
		if (localCountryCode == null) {
			if (other.localCountryCode != null)
				return false;
		} else if (!localCountryCode.equals(other.localCountryCode))
			return false;
		if (localPhoneNumber == null) {
			if (other.localPhoneNumber != null)
				return false;
		} else if (!localPhoneNumber.equals(other.localPhoneNumber))
			return false;
		return true;
	}
	
	

}
