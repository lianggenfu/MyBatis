package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImgWriteUtil {

	public void writeImg(BufferedInputStream bis, BufferedOutputStream bos) {// 写入图片
		int len = 0;
		try {
			byte[] buffer = new byte[2048];
			while ((len = bis.read(buffer)) > 0) {
				bos.write(buffer, 0, len);
			}
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
			throw new RuntimeException("创建文件时出错！");
		} catch (IOException exception) {
			exception.printStackTrace();
			throw new RuntimeException("读写文件时出错！");
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
