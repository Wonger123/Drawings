/* Andrew Wong
 * Apr.30.22
 * 
 * A drawing
 */
package Art;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.Polygon;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SkyDrawing extends JFrame {

	public static void main(String[] args) {
		new SkyDrawing();		
	}

	SkyDrawing() {
		this.setSize(900, 450);
		this.setTitle("Drawing 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingPanel panel = new DrawingPanel();

		this.add(panel);
		this.setVisible(true);
	}

	class DrawingPanel extends JPanel {
		DrawingPanel() {
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			// background
			g2.setPaint(background(g));
			g.setColor(Color.decode("#dee5ea"));
			for (int i = 0; i < 7; i++) {
				int x = (int) (Math.random() * 75) + 425;
				int y = (int) (Math.random() * 75) + 175;
				g.fillRect(x, y, 2, 2);
			}

			// tower
			g.fillPolygon(tower(g));
			g.setColor(Color.decode("#5f2450"));
			g.fillRect(405, 225, 5, 60);

			// star
			g.fillPolygon(star(g));

			// rock
			g.setColor(Color.decode("#722b53"));
			g.fillPolygon(rock());

			// wall
			g.fillPolygon(wall(g));

			// castle
			g.fillPolygon(castle(g));
			
			// ground
			g.setColor(Color.decode("#4f8fb5"));
			Polygon ground = new Polygon();
			ground.addPoint(0, 340);
			ground.addPoint(0, 450);
			ground.addPoint(900, 450);
			ground.addPoint(900, 300);
			ground.addPoint(700, 300);
			g.fillPolygon(ground);
		}

		public RadialGradientPaint background(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			Point2D center = new Point2D.Float(450, 225);
			int radius1 = 225;
			float[] dist1 = { 0.55f, .95f };
			Color[] colours1 = { Color.decode("#944367"), Color.decode("#371b50") };
			RadialGradientPaint background1 = new RadialGradientPaint(center, radius1, dist1, colours1,
					CycleMethod.NO_CYCLE);
			g2.setPaint(background1);
			g.fillRect(-getWidth(), -getHeight(), getWidth() * 3, getHeight() * 3);

			g.setColor(Color.decode("#a4b6b8"));
			for (int i = 0; i < 150; i++) {
				int x = (int) (Math.random() * 899) + 1;
				int y = (int) (Math.random() * 349) + 1;
				g.fillRect(x, y, 2, 2);
			}

			int radius2 = 132;
			float[] dist2 = { 0.05f, .95f };
			Color[] colours2 = { Color.decode("#dc9372"), Color.decode("#944367") };
			RadialGradientPaint background2 = new RadialGradientPaint(center, radius2, dist2, colours2,
					CycleMethod.NO_CYCLE);
			g2.setPaint(background2);
			g.fillOval(325, 100, 250, 250);

			return background2;
		}

		public Polygon rock() {
			Polygon rock = new Polygon();
			rock.addPoint(350, 240);
			rock.addPoint(380, 230);
			rock.addPoint(400, 260);
			rock.addPoint(430, 260);
			rock.addPoint(470, 270);
			rock.addPoint(550, 270);
			rock.addPoint(700, 390);
			rock.addPoint(360, 390);
			rock.addPoint(330, 270);
			return rock;
		}

		public Polygon castle(Graphics g) {
			g.setColor(Color.decode("#3c1b53"));
			Polygon castle1 = new Polygon();
			castle1.addPoint(480, 250);
			castle1.addPoint(485, 255);
			castle1.addPoint(490, 250);
			castle1.addPoint(520, 245);
			castle1.addPoint(520, 225);
			castle1.addPoint(525, 220);
			castle1.addPoint(525, 210);
			castle1.addPoint(530, 205);
			castle1.addPoint(533, 200);
			castle1.addPoint(535, 205);
			castle1.addPoint(540, 210);
			castle1.addPoint(540, 220);
			castle1.addPoint(545, 225);
			castle1.addPoint(545, 245);
			castle1.addPoint(550, 250);
			castle1.addPoint(550, 275);
			castle1.addPoint(530, 290);
			castle1.addPoint(515, 292);
			castle1.addPoint(510, 290);
			castle1.addPoint(505, 292);
			castle1.addPoint(500, 290);
			castle1.addPoint(495, 292);
			castle1.addPoint(490, 290);
			castle1.addPoint(470, 290);
			castle1.addPoint(460, 270);
			castle1.addPoint(465, 260);
			g.fillPolygon(castle1);

			g.setColor(Color.decode("#4d1e52"));
			Polygon castle2 = new Polygon();
			castle2.addPoint(560, 252);
			castle2.addPoint(560, 232);
			castle2.addPoint(565, 227);
			castle2.addPoint(565, 217);
			castle2.addPoint(570, 212);
			castle2.addPoint(575, 217);
			castle2.addPoint(575, 227);
			castle2.addPoint(580, 232);
			castle2.addPoint(580, 252);
			castle2.addPoint(585, 257);
			castle2.addPoint(585, 262);
			castle2.addPoint(585, 272);
			castle2.addPoint(587, 276);
			castle2.addPoint(587, 278);
			castle2.addPoint(585, 280);
			castle2.addPoint(572, 284);
			castle2.addPoint(555, 280);
			castle2.addPoint(555, 262);

			g.fillPolygon(castle2);
			return castle2;
		}

		public Polygon tower(Graphics g) {
			g.setColor(Color.decode("#682459"));
			Polygon tower = new Polygon();
			tower.addPoint(410, 250);
			tower.addPoint(410, 210);
			tower.addPoint(405, 200);
			tower.addPoint(400, 170);
			tower.addPoint(395, 165);
			tower.addPoint(390, 165);
			tower.addPoint(385, 170);
			tower.addPoint(380, 200);
			tower.addPoint(375, 210);
			tower.addPoint(375, 260);
			tower.addPoint(425, 265);
			tower.addPoint(425, 253);
			g.fillPolygon(tower);

			g.setColor(Color.decode("#762466"));
			Polygon towerWindow = new Polygon();
			towerWindow.addPoint(395, 173);
			towerWindow.addPoint(390, 173);
			towerWindow.addPoint(385, 190);
			towerWindow.addPoint(393, 195);
			towerWindow.addPoint(400, 190);
			g.fillPolygon(towerWindow);
			return towerWindow;
		}

		public Polygon wall(Graphics g) {
			g.setColor(Color.decode("#0a0a37"));
			
			g.fillRoundRect(675, 285, 170, 70, 50, 50);
			Polygon miniTower = new Polygon();
			miniTower.addPoint(720, 285);
			miniTower.addPoint(724, 275);
			miniTower.addPoint(726, 275);
			miniTower.addPoint(731, 250);
			miniTower.addPoint(737, 275);
			miniTower.addPoint(739, 275);
			miniTower.addPoint(743, 285);
			g.fillPolygon(miniTower);
			
			Polygon wall = new Polygon();
			wall.addPoint(40, 310);

			wall.addPoint(150, 310);
			wall.addPoint(152, 300);
			wall.addPoint(154, 300);
			wall.addPoint(160, 280);
			wall.addPoint(166, 300);
			wall.addPoint(168, 300);
			wall.addPoint(170, 310);
			
			wall.addPoint(290, 310);
			wall.addPoint(292, 305);
			wall.addPoint(294, 305);
			wall.addPoint(298, 290);
			wall.addPoint(302, 305);
			wall.addPoint(304, 305);
			wall.addPoint(306, 310);

			wall.addPoint(360, 310);
			wall.addPoint(362, 305);
			wall.addPoint(364, 305);
			wall.addPoint(368, 290);
			wall.addPoint(372, 305);
			wall.addPoint(374, 305);
			wall.addPoint(376, 310);

			wall.addPoint(386, 310);
			wall.addPoint(400, 325);
			wall.addPoint(30, 400);
			wall.addPoint(30, 315);
			g.fillPolygon(wall);

			return wall;
		}

		public Polygon star(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			g.setColor(Color.decode("#e1f6f7"));
			Polygon fullStar = new Polygon();
			fullStar.addPoint(155, 130);
			fullStar.addPoint(160, 105);
			fullStar.addPoint(165, 130);
			fullStar.addPoint(178, 122);
			fullStar.addPoint(172, 137);
			fullStar.addPoint(197, 142);
			fullStar.addPoint(171, 147);
			fullStar.addPoint(178, 162);
			fullStar.addPoint(165, 154);
			fullStar.addPoint(160, 179);
			fullStar.addPoint(155, 154);
			fullStar.addPoint(140, 162);
			fullStar.addPoint(148, 147);
			fullStar.addPoint(123, 142);
			fullStar.addPoint(149, 137);
			fullStar.addPoint(140, 122);
			g.fillPolygon(fullStar);
			
			Point2D centre = new Point2D.Float(160, 142);
			int radius = 17;
			float[] dist = { 0.05f, .95f };
			Color[] colours = { Color.decode("#727da4"), Color.decode("#d7eff1") };
			RadialGradientPaint star = new RadialGradientPaint(centre, radius, dist, colours, CycleMethod.NO_CYCLE);
			g2.setPaint(star);
			g.fillOval(145, 127, 30, 30);

			return fullStar;
		}
	}
}