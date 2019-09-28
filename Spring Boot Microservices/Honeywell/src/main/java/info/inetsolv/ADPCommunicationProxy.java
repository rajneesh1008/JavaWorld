package info.inetsolv;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name="adp")
@FeignClient(name="adp")
public interface ADPCommunicationProxy {


	@GetMapping(path="/adp/tax/{eno}/{salary}")
	public HoneywellEmployee calTax(@PathVariable("eno") Integer eno,
			@PathVariable("salary") Double salary);
		
}
