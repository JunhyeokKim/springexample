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
		System.out.println("Ŭ���̾�Ʈ�κ��� ���ε� ��û�� ����: " + report.getOriginalFilename());
		// service�� ó��..

		return "f01_file/a01_uploadForm";
	}

	// ���� �̸��� �Ѱܿ� ��Ʈ�� ������ ��ü�� server�� Ư���� ��ġ�� ����
	private void uploadProd(String name, MultipartFile report) {
		// eclipse �ӽ� ����
		// ���� ������ �ε�
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
