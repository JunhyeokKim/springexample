package springweb.f01_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
		uploadProc(report);
		System.out.println("hihi");
		return "f01_file/a01_uploadForm";
	}
	// <input name="fname"/>

	// ���� �̸��� �Ѱܿ� ��Ʈ�� ������ ��ü�� server�� Ư���� ��ġ�� ����
	private void uploadProc(MultipartFile report) {
		String name = report.getOriginalFilename();
		// eclipse �ӽ� ����
		// ���� ������ �ε�
		String path01 = "C:/junhyeok/a01_prog/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/webapps/springweb/z02_upload/";
		String path02 = "C:/junhyeok/a01_prog/workspace/springweb/WebContent/z02_upload/";
		// �ش� ��η� ������ �Ҵ�
		String file01 = path01 + name;
		String file02 = path02 + name;
		// MultipartFile ==> File�� ��ȯ
		File f1 = new File(file01);
		File f2 = new File(file02);
		MultipartFile mf = report;
		try {
			mf.transferTo(f1);
			copy(f1,f2);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void downloadProc(){
		
	}

	// eclipse �ӽ� ��ġ�� �ִ� ������ ����� ��ġ�� copy ó��
		private void copy(File org, File tgt) throws IOException {
			FileInputStream in = new FileInputStream(org);
			FileOutputStream out = new FileOutputStream(tgt);

			byte[] buff = new byte[1024 * 8];
			int nRead;
			while ((nRead = in.read(buff)) != -1) {
				out.write(buff, 0, nRead);
			}
			in.close();
			out.close();

		}

}
