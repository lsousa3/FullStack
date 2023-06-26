package UTIL;

/**
 *
 * @author marcelosiedler
 */
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ManipularImagem {

    // Método para redimensionar a imagem
    public static BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura) {
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;

        try {
            // *** Recebe a imagem que vai ser redimensionada ***
            imagem = ImageIO.read(new File(caminhoImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ManipularImagem.class.getName()).log(Level.SEVERE, null, ex);
        }

        // *** Recebe a largura da imagem ***
        novaImgLargura = (double) imagem.getWidth();

        // *** Recebe a altura da iamgem ***
        novaImgAltura = (double) imagem.getHeight();

        // *** Verifica se a altura e largura da iamgem recebida é maior que os parâmetros para redimensionamento ***
        if (novaImgLargura >= imgLargura) {
            imgProporcao = (novaImgAltura / novaImgLargura); //calcula a proporção
            novaImgLargura = (double) imgLargura;

            // *** altura deve ser <= ao parâmetro imgAltura e proporcional à largura ***
            novaImgAltura = (novaImgLargura * imgProporcao);

            // *** se a altura for maior do que o parâmetro imgAltura, diminui-se a largura de forma que a altura seja igual ao parâmetro imgAltura e proporcional a largura ***
            while (novaImgLargura > imgAltura) {
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }

        } else if (novaImgAltura >= imgAltura) {
            imgProporcao = (novaImgLargura / novaImgAltura); //calcula a porporção
            novaImgAltura = (double) imgAltura;

            // *** se a largura for maior do que o parâmtro imgLargura, diminui-se a altura de forma que a largura seja igual ao parâmetro imgLargura  e proporcional a altura ***
            while (novaImgLargura > imgLargura) {
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }

        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);

        return novaImagem;

    }

    // Método para converter para uma rede bytes
    public static byte[] getImgBytes(BufferedImage image) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "JPEG", baos);
        } catch (IOException ex) {

        }

        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        return baos.toByteArray();
    }

    //Método para exibr a imagem na tela
    public static void exibiImagemLabel(byte[] minhaimagem, javax.swing.JLabel label) {
        // *** primeiro verifica se tem a imagem 
        // se tem converte em inputstream que é o formato reconhecido pelo ImageIO
        if (minhaimagem != null) {
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try {
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {

            }
        } else {
            label.setIcon(null);
        }
    }
}
