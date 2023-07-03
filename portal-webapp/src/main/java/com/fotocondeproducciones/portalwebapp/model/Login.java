package com.fotocondeproducciones.portalwebapp.model;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
@FieldNameConstants
public class Login {
	private String contractNo;
	private String email;
	private String password;

}
