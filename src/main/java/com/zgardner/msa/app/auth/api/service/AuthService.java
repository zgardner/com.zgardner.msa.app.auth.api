package com.zgardner.msa.app.auth.api.service;

import java.util.Calendar;
import java.util.Date;

import com.zgardner.msa.app.auth.api.model.ObtainApiTokenRequest;
import com.zgardner.msa.app.auth.api.model.ObtainAccessTokenResponse;

public class AuthService {

	public ObtainAccessTokenResponse obtainAccessToken (ObtainApiTokenRequest obtainApiTokenRequest) {
		ObtainAccessTokenResponse obtainAccessTokenResponse = new ObtainAccessTokenResponse();
		
		obtainAccessTokenResponse.accessToken = "12345";
		obtainAccessTokenResponse.expires = Calendar.getInstance().getTime();
		
		return obtainAccessTokenResponse;
	}
}
