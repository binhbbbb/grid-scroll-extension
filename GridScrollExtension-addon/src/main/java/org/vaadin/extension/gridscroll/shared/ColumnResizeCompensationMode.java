package org.vaadin.extension.gridscroll.shared;

public enum ColumnResizeCompensationMode {

    /**
     * When column resize compensation mode is set to NONE,
     * Grid's width or columns are not adjusted upon column resize. 
     */
	NONE,
	
    /**
     * When column resize compensation mode is set to RESIZE_GRID,
     * Grid's width is adjusted according to widths of the column. 
     */
	RESIZE_GRID,
	
    /**
     * When column resize compensation mode is set to RESIZE_COLUMN,
     * Grid's last column is adjusted occupy the remaining space
     * available (if there is any). 
     */
	RESIZE_COLUMN
	
}
