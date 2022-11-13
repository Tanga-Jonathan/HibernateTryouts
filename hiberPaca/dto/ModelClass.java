package hiberPaca.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Kyokazi Tribe")
public class ModelClass {
	private String name;
	private String Tribe;
	@Id
	private String ModelId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTribe() {
		return Tribe;
	}
	public void setTribe(String tribe) {
		Tribe = tribe;
	}
	public String getModelId() {
		return ModelId;
	}
	public void setModelId(String modelId) {
		ModelId = modelId;
	}

}
