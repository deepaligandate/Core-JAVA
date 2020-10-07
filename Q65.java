import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class CountNoOfByte {

	public static void main(String[] args) throws IOException {
		String dirName="C:\\Users\\Admin\\OneDrive\\Pictures";
		ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
		BufferedImage img=ImageIO.read(new File(dirName,"th.jpg"));
		ImageIO.write(img, "jpg", baos);
		baos.flush();
 
		String base64String=Base64.encode(baos.toByteArray());
		baos.close();
 
		byte[] bytearray = Base64.decode(base64String);
 
		BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
		ImageIO.write(imag, "jpg", new File(dirName,"Pictures"));
	}

}
