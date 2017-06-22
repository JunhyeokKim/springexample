package springweb.f01_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//springweb.f01_file.A01_FileCtrl.java
@Controller
@RequestMapping("/upload.do")
public class A01_FileCtrl {
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "f01_file/a01_uploadForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String upload(@RequestParam(value = "report") MultipartFile report) {
		System.out.println("클라이언트로부터 업로드 요청된 파일: " + report.getOriginalFilename());
		// service단 처리..

		return "f01_file/a01_uploadForm";
	}

	// 파일 이름과 넘겨온 스트림 형태의 객체를 server의 특정한 위치에 저장
	private void uploadProd(String name, MultipartFile report) {
		// eclipse 임시 공간
		// 실제 파일을 로딩
		String path01 = "";
		String path02= "";
		try {
			InputStream inputStream = report.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
