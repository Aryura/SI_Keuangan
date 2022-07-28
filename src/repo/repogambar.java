/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author maula
 */
public class repogambar {
      public Image adminImage(){
        ImageIcon check = new ImageIcon("src\\icon\\admin.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
    }
      public Image databiayaImage(){
        ImageIcon check = new ImageIcon("src\\icon\\datbiaya.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
    }
      public Image guruImage(){
        ImageIcon check = new ImageIcon("src\\icon\\guru.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
    }
      public Image kelasImage(){
        ImageIcon check = new ImageIcon("src\\icon\\kelas.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
    }
    public Image siswaImage(){
        ImageIcon check = new ImageIcon("src\\icon\\siswa.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
     public Image walasImage(){
        ImageIcon check = new ImageIcon("src\\icon\\walas.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
    public Image gajiguruImage(){
        ImageIcon check = new ImageIcon("src\\icon\\gajiguru.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
    public Image infoImage(){
        ImageIcon check = new ImageIcon("src\\icon\\info.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
    public Image sppImage(){
        ImageIcon check = new ImageIcon("src\\icon\\spp.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
    public Image ujianImage(){
        ImageIcon check = new ImageIcon("src\\icon\\ujian.png");
        Image img = check.getImage();
        Image imgscale = img.getScaledInstance(50, 60, Image.SCALE_DEFAULT);
        return imgscale;
     }
}