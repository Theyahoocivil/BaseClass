import java.io.IOException;

public class table extends BaseClass{
public void webtable() throws IOException {
	getDriver("chrome");
	launchurl("https://www.google.com/search?q=ipl+table+2022&rlz=1C1CHBF_en-GBIN1049IN1049&sxsrf=AJOqlzWEk19fLYvYqxNUn9AgiotTEaQMeA%3A1679669204837&ei=1LcdZNzMMu2mseMP7JOMmAw&ved=0ahUKEwjchq2y5_T9AhVtU2wGHewJA8MQ4dUDCBA&uact=5&oq=ipl+table+2022&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzILCAAQgAQQsQMQgwEyCggAEIAEEBQQhwIyBQgAEIAEMgUIABCABDIFCAAQgAQyBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeOgoIABBHENYEELADOgoIABCKBRCwAxBDOg8ILhCKBRDIAxCwAxBDGAE6EgguEIoFENQCEMgDELADEEMYAToECCMQJzoHCAAQigUQQ0oECEEYAFD9A1j3B2CiC2gBcAF4AIABeogB4AGSAQMwLjKYAQCgAQHIARLAAQHaAQYIARABGAg&sclient=gws-wiz-serp");
	WebTableToXl("", null, null);	



}

}
