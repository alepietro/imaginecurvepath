package entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONTRIBUTORS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contributors {

	@XmlElement
	private String FIRSTCONTRIBUTOR;
	@XmlElement
	private String SECONDCONTRIBUTOR;

	public String getFIRSTCONTRIBUTOR() {
		return FIRSTCONTRIBUTOR;
	}

	public void setFIRSTCONTRIBUTOR(String fIRSTCONTRIBUTOR) {
		FIRSTCONTRIBUTOR = fIRSTCONTRIBUTOR;
	}

	public String getSECONDCONTRIBUTOR() {
		return SECONDCONTRIBUTOR;
	}

	public void setSECONDCONTRIBUTOR(String sECONDCONTRIBUTOR) {
		SECONDCONTRIBUTOR = sECONDCONTRIBUTOR;
	}
}
