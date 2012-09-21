import java.io.IOException;

public class PGMImage {
	
	private short hauteur;
	private short largeur;
	private short[] histogramme = new short[256];
	
	public PGMImage(String filePath){
		
		for (int i=0; i<=255;i++){
			histogramme[i]=0;
		}
		
		try {
			ShortPixmap image = new ShortPixmap(filePath);
			hauteur = (short) image.height;
			largeur = (short) image.width;
			for (int i=0; i<=255; i++) {
				for (int j=0; i<=512*512; i++ ) {
					histogramme[i]++; 
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readPGM(String filePath){
		PGMImage image = new PGMImage(filePath);
		System.out.println("Image : "+ filePath);
		System.out.println("Hauteur de l'image : "+image.hauteur);
		System.out.println("Largeur de l'image : "+image.largeur);
	}

//	/** Lecture d'un seul pixel : */
//	int rgb = bufferedImage.getRGB(x,y);
//
//	/** Lecture de tous les pixels : */
//	int w = bufferedImage.getWidth();
//	int h = bufferedImage.getHeight();
//	int[] rgbs = new int[w*h]; /** on crée l'espace neccessaire */
//	bufferedImage.getRGB(0,0,w,h,rgbs,0,w);

	//	/** Ecriture d'un seul pixel : */
	//	bufferedImage.setRGB(x,y,rgb);
	//
	//	/** Ecriture de tous les pixels : */
	//	int w = bufferedImage.getWidth();
	//	int h = bufferedImage.getHeight();
	//	int[] rgbs = new int[w*h];
	//	bufferedImage.setRGB(0,0,w,h,rgbs,0,w);
	
//	/** Effectue une homothétie de l'image.
//	 * 
//	 * @param bi l'image.
//	 * @param scaleValue la valeur de l'homothétie.
//	 * @return une image réduite ou agrandie.
//	 * 
//	 */public static BufferedImage scale(BufferedImage bi, double scaleValue) {
//	        AffineTransform tx = new AffineTransform();
//	        tx.scale(scaleValue, scaleValue);
//	        AffineTransformOp op = new AffineTransformOp(tx,
//	                AffineTransformOp.TYPE_BILINEAR);
//	        BufferedImage biNew = new BufferedImage( (int) (bi.getWidth() * scaleValue),
//	                (int) (bi.getHeight() * scaleValue),
//	                bi.getType());
//	        return op.filter(bi, biNew);
//	                
//	} 
	
	
}
