package com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dto.UploadDTO;

@Controller
public class UploadController {

	@GetMapping("/uploadForm")
	public String uploadForm() {
		
		return "uploadForm"; //  /WEB-INF/views/uploadForm.jsp
	}

	@PostMapping("/upload")
	public String upload(UploadDTO dto) {
		
		String theText = dto.getTheText();
		CommonsMultipartFile theFile = dto.getTheFile();
		
		//파일정보
		long size = theFile.getSize();
		String name = theFile.getName();
		String originalFilename = theFile.getOriginalFilename();
		String contentType = theFile.getContentType();
		
		System.out.println(size);
		System.out.println(name);
		System.out.println(originalFilename);
		System.out.println(contentType);
		
		File f = new File("c:\\upload", originalFilename) ;
		
		try {
			theFile.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "uploadForm"; //  /WEB-INF/views/uploadForm.jsp
	}
}
