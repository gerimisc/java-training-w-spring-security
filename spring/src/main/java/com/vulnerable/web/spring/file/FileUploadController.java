package com.vulnerable.web.spring.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileUploadController {

//	private static final Logger logger = LoggerFactory
//			.getLogger(FileUploadController.class);
//	
	/**
	 * Upload single file using Spring Controller
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String uploadFilePage() {
		return "upload";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String uploadFileHandler(ModelMap model, @RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				String name = file.getOriginalFilename();
				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

//				logger.info("Server File Location="
//						+ serverFile.getAbsolutePath());
				String path = "File has been uploaded to <b>" + serverFile;
				model.addAttribute("path", path);
				return "upload";
			} catch (Exception e) {
				return "You failed to upload " + "" + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + ""
					+ " because the file was empty.";
		}
	}
}
