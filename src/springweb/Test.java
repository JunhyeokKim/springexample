package springweb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import springweb.z01_dto.BookT;

public class Test {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://api.saramin.co.kr/job-search?loc_cd=101000&count=110&start=5");
		URLConnection urlConn = url.openConnection(); // openConnection 해당 요청에
		// 대해서 쓸 수 있는 connection
		// 객체
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(urlConn.getInputStream(), "UTF-8");
		Element root = doc.getDocumentElement();
		NodeList jobs = root.getElementsByTagName("name");
		System.out.println(jobs.getLength());
		for (int i = 0; i < jobs.getLength(); i++) {
			Node job = jobs.item(i);
			System.out.println(job.getTextContent());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));

		StringBuilder data = new StringBuilder();
		String msg = null;
		while ((msg = br.readLine()) != null) { // System.out.println(msg);
			data.append(msg + "\n");

		}
		System.out.println(data.toString());

	}

}
