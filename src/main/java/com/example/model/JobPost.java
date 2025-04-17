package com.example.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

	
	private int postId, ReqExperience;
	private String PostProfile, PostDesc;
	private ArrayList<String> PostTechStack;
	
}
