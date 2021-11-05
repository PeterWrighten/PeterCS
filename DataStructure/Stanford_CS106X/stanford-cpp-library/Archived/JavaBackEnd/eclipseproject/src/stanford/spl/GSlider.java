/*
 * @version 2018/06/23
 * - added change listener functionality
 */

package stanford.spl;

import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;

public class GSlider extends GInteractor {
	private static final long serialVersionUID = 1L;
	
	/**
	 * Settings for Java look-and-feel related to tables.
	 */
	public static void setSystemLookAndFeelProperties() {
		UIManager.getLookAndFeelDefaults().put("Slider.paintValue", false);
		UIManager.put("Slider.paintValue", false);
	}
	
	public GSlider(int paramInt1, int paramInt2, int paramInt3, ChangeListener paramChangeListener) {
		super(new JSlider(paramInt1, paramInt2, paramInt3));
		JSlider localJSlider = getJSlider();
		if (paramChangeListener != null) {
			localJSlider.addChangeListener(paramChangeListener);
			localJSlider.setLabelTable(null);
		}
	}
	
	public void addChangeListener(ChangeListener listener) {
		JSlider slider = getJSlider();
		if (slider != null) {
			slider.addChangeListener(listener);
		}
	}
	
	public boolean getPaintLabels() {
		return getJSlider().getPaintLabels();
	}
	
	public boolean getPaintTicks() {
		return getJSlider().getPaintTicks();
	}
	
	public boolean getSnapToTicks() {
		return getJSlider().getSnapToTicks();
	}
	
	public int getMajorTickSpacing() {
		return getJSlider().getMajorTickSpacing();
	}
	
	public int getMinorTickSpacing() {
		return getJSlider().getMinorTickSpacing();
	}
	
	public boolean hasChangeListener() {
		JSlider slider = getJSlider();
		return slider != null && slider.getChangeListeners().length > 0;
	}
	
	public void removeChangeListener(ChangeListener listener) {
		JSlider slider = getJSlider();
		if (slider != null) {
			slider.removeChangeListener(listener);
		}
	}
	
	public void removeChangeListeners() {
		JSlider slider = getJSlider();
		if (slider != null) {
			for (ChangeListener listener : slider.getChangeListeners()) {
				slider.removeChangeListener(listener);
			}
		}
	}
	
	public void setPaintLabels(boolean value) {
		getJSlider().setPaintLabels(value);
	}
	
	public void setPaintTicks(boolean value) {
		getJSlider().setPaintTicks(value);
	}
	
	public void setSnapToTicks(boolean value) {
		getJSlider().setSnapToTicks(value);
	}
	
	public void setMajorTickSpacing(int value) {
		getJSlider().setMajorTickSpacing(value);
	}
	
	public void setMinorTickSpacing(int value) {
		getJSlider().setMinorTickSpacing(value);
	}
	
	private JSlider getJSlider() {
		return (JSlider) getInteractor();
	}
}
