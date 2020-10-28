
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PhongFPT
 */
public class NewClass {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("1000000000000000000000");
        System.out.println(a.divide(b, 8, RoundingMode.CEILING).doubleValue());
    }
}
