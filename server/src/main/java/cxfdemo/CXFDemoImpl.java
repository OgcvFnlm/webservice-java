package cxfdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;

@WebService
public class CXFDemoImpl implements CXFDemo{

	@Override
	public String sayHello(String foo) {
		return  "hello "+ foo+", at["+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
	}

}
