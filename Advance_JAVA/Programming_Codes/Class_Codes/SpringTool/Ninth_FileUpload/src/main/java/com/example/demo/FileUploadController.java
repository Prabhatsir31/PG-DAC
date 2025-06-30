package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	
   @GetMapping(value = "fileUploadPage")
   public ModelAndView fileUploadPage() {
      FileModel file = new FileModel();
      ModelAndView modelAndView = new ModelAndView("fileUpload", "command", file);
      return modelAndView;
   }

  
   @PostMapping(value="/fileUploadPage")
   public String fileUpload(FileModel file,Model model) throws IOException {
      
	   String uploadPath = "PATH_OF_THE_UPLOAD_FILE"+file.getFile().getOriginalFilename();
       Files.copy(file.getFile().getInputStream(), Paths.get(uploadPath), StandardCopyOption.REPLACE_EXISTING);
         String fileName=file.getFile().getOriginalFilename();
       
        model.addAttribute("fileName", fileName);
         return "success";
      }
   }
