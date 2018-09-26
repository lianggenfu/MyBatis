package utils;
/**
 * 工具类 ，FileUpload 完成上传文件。
 * 需要commons-fileupload.jar 和 commons-io.jar  支持。
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUtil {
	private ServletFileUpload servletFileUpload;
	private List<FileItem> fileItems;

	@SuppressWarnings("unchecked")
	public UploadUtil(HttpServletRequest request) {
		FileItemFactory fileItemFactory = new DiskFileItemFactory();
		servletFileUpload = new ServletFileUpload(fileItemFactory);
		try {
			fileItems = servletFileUpload.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 解析得到 fieldName 的值
	 * @param fieldName
	 * @return
	 */
	public String getParameter(String fieldName) {
		return this.getParameter(fieldName, "utf-8");
	}
	/**
	 * 解析得到 fieldName 的值
	 * @param fieldName
	 * @param encoding
	 * @return
	 */
	public String getParameter(String fieldName, String encoding) {
		String value = null;
		if (fileItems != null) {
			for (FileItem fileItem : fileItems) {
				String name = fileItem.getFieldName();
				if ((fileItem.isFormField())&&(name != null) && (fieldName.equals(name))) {
					try {
						value = fileItem.getString(encoding);
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return value;
	}
	/**
	 * 解析得到 fieldName 的值 (集合类型)
	 * @param fieldName
	 * @return
	 */
	public List<String> getParameterValues(String fieldName){
		return this.getParameterValues(fieldName, "utf-8");
	}
	/**
	 * 解析得到 fieldName 的值 (集合类型)
	 * @param fieldName
	 * @param encoding
	 * @return
	 */
	public List<String> getParameterValues(String fieldName,String encoding){
		List<String>list=new ArrayList<String>();
		if(fileItems!=null){
			for(FileItem fileItem:fileItems){
				String name = fileItem.getFieldName();
				if((fileItem.isFormField())&&(name!=null)&&fieldName.equals(name)){
					try {
						String value = fileItem.getString(encoding);
						list.add(value);
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		if((list!=null)&&(list.size()>0)){
			return list;
		}
		return null;
	}
	/**
	 * 解析得到 上传文件的 输入流
	 * @param fieldName
	 * @return
	 */
	public BufferedInputStream getInputStream(String fieldName){
		BufferedInputStream bufferedInputStream=null;
		if(fileItems!=null){
			for(FileItem fileItem:fileItems){
				String name = fileItem.getFieldName();
				if((!fileItem.isFormField())&&(name!=null)&&fieldName.equals(name)){
					try {
						InputStream inputStream=fileItem.getInputStream();
						bufferedInputStream=new BufferedInputStream(inputStream);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return bufferedInputStream;
	}
	/**
	 * 解析得到上传文件的名称。
	 * @param fieldName
	 * @return
	 */
	public String getFileName(String fieldName){
		String fileName=null;
		if(fileItems!=null){
			for(FileItem fileItem:fileItems){
				String name = fileItem.getFieldName();
				if((!fileItem.isFormField())&&(name!=null)&&fieldName.equals(name)){
					fileName=fileItem.getName();
				}
			}
		}
		return fileName;
	}
}
