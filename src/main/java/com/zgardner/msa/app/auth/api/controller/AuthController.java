package com.zgardner.msa.app.auth.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zgardner.msa.app.auth.api.model.ObtainApiTokenRequest;
import com.zgardner.msa.app.auth.api.model.ObtainAccessTokenResponse;
import com.zgardner.msa.app.auth.api.service.AuthService;

@RestController
public class AuthController {
	
	AuthService authService = new AuthService();
	
	@RequestMapping("/accessToken")
	public ObtainAccessTokenResponse obtainAccessToken (@RequestBody ObtainApiTokenRequest obtainApiTokenRequest) {
		ObtainAccessTokenResponse obtainAccessTokenResponse = this.authService.obtainAccessToken(obtainApiTokenRequest);
		
		return obtainAccessTokenResponse;
	}
}
