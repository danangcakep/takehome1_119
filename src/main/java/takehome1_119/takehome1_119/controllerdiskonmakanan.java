/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import takehome1_119.takehome1_119.controllerhitung;


/**
 *
 * @author Microsoft
 */
@Controller
public class controllerdiskonmakanan {
    @RequestMapping("/index")
    public String inputanuser(HttpServletRequest data, Model makanan){
        String namamakanan = data.getParameter("var_namamakanan");
        String hargamakanan = data.getParameter("var_hargaporsi");
        String jumlahporsi = data.getParameter("var_jumlahbeli");
    
         controllerhitung eat = new controllerhitung ();
        int a2e= eat.hitung(hargamakanan,jumlahporsi);
        int aa24=eat.diskon();

        makanan.addAttribute("namamakanan",namamakanan);
        makanan.addAttribute("hargamakanan",hargamakanan);
        makanan.addAttribute("jumlahporsi",jumlahporsi);
        makanan.addAttribute("totalmakanandiskon",aa24);
        makanan.addAttribute("eat",eat.tampildiskon());
         return "tampilmakanan";
    }
}
    
