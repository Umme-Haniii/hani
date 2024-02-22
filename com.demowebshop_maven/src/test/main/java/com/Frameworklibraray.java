public class Frameworklibraray {

	public static void selectClass(WebElement dropdown, String option) {
		Select select = new Select(dropdown);
		int counter = 0;
		try {
			int indexvalue = Integer.parseInt(option);
			select.selectByIndex(indexvalue);
			counter++;
		} catch (Exception e) {
		,g	System.out.println("not an index value");
		}
		if (counter == 0) {
			try {
				select.selectByValue(option);
			} catch (Exception e) {
				select.selectByVisibleText(option);
			}
		}
	}
	public void takescreenshot(WebDriver driver) throws IOException {
		LocalDateTime dateTime=LocalDateTime.now();
		String filename = dateTime.toString().replaceAll(":", "-");
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/zomatoapplication.png");
		try {
			
			FileHandler.copy(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	public void takescreenshotofelement(WebElement element) {
		File src = element.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/Element"+name()+".png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			e.printStackTrace();
	}

}
	private String name() {
		LocalDateTime dateTime=LocalDateTime.now();
		String filename = dateTime.toString().replaceAll(":", "-");
		return null;
	}
}