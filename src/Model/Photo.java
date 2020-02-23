package Model;

/* Jeanna Maye E. Benitez
 * Date: 02/02/2020
 * This Class will output a photo
 */

import java.awt.*;  
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Photo 
{
	BufferedImage photos;
	JFrame editorFrame;
	JLabel label;
	
	public Photo(BufferedImage photos, JFrame editorFrame, JLabel label)
	{
		super();
		this.photos = photos;
		this.editorFrame = editorFrame;
		this.label = label;
	}

	public BufferedImage getPhotos() 
	{
		return photos;
	}

	public void setPhotos(BufferedImage photos) 
	{
		this.photos = photos;
	}

	public JFrame getEditorFrame() 
	{
		return editorFrame;
	}

	public void setEditorFrame(JFrame editorFrame) 
	{
		this.editorFrame = editorFrame;
	}

	public JLabel getLabel() 
	{
		return label;
	}

	public void setLabel(JLabel label) 
	{
		this.label = label;
	}
}
