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
		System.out.println("클라이언트로부터 업로드 요청된 파일: " + report.getOriginalFilename());
		// service단 처리..
		uploadProc(report);
		System.out.println("hihi");
		return "f01_file/a01_uploadForm";
	}
	// <input name="fname"/>

	// 파일 이름과 넘겨온 스트림 형태의 객체를 server의 특정한 위치에 저장
	private void uploadProc(MultipartFile report) {
		String name = report.getOriginalFilename();
		// eclipse 임시 공간
		// 실제 파일을 로딩
		String path01 = "C:/junhyeok/a01_prog/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/webapps/springweb/z02_upload/";
		String path02 = "C:/junhyeok/a01_prog/workspace/springweb/WebContent/z02_upload/";
		// 해당 경로로 파일을 할당
		String file01 = path01 + name;
		String file02 = path02 + name;
		// MultipartFile ==> File로 전환
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

	// eclipse 임시 위치에 있는 파일을 사용할 위치로 copy 처리
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
