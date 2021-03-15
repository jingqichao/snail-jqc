/*
 * FileName: FileUtil
 * Author:   jqc
 * Date:     2021/3/15 14:48
 * Description: 文件处理工具
 */
package util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件处理工具
 *
 * @author jingqc
 * @create 2021/3/15
 */
public class FileUtil {

    /**
     * MultipartFile 转 File
     *
     */
    public static File multipartFileToFile(MultipartFile multipartFile) throws Exception {

        File toFile;
        if (multipartFile.getSize() <= 0) {
            return null;
        } else {
            InputStream ins = null;
            ins = multipartFile.getInputStream();
            toFile = new File(multipartFile.getOriginalFilename());
            inputStreamToFile(ins, toFile);
            ins.close();
        }
        return toFile;
    }

    /**
     * 获取流文件
     *
     */
    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除本地临时文件
     */
    public static void deleteTempFile(File file) {
        if (file != null) {
            File del = new File(file.toURI());
            del.delete();
        }
    }

}
