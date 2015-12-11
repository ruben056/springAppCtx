package be.rd.services.beans;

import org.springframework.stereotype.Service;
import javax.annotation.*;

@Service("echoBean")
public class Echo implements IEcho {
	
	@Resource(name="snowEcho")
	private IMsgProvider msgProvider;
	
	public void setMsgProvider(IMsgProvider msgProvider) {
		this.msgProvider = msgProvider;
	}
	
	@Override
	public void echo() {
		System.out.println(msgProvider.getMsg());
	}

}
