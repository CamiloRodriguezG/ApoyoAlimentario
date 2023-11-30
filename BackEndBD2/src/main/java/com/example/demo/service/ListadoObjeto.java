package com.example.demo.service;

import org.hibernate.engine.jdbc.cursor.spi.RefCursorSupport;

import com.example.demo.model.ErrorPL;

public class ListadoObjeto {
    private ErrorPL errorPL;
    private RefCursorSupport cursor;
    public ListadoObjeto(ErrorPL errorPL, RefCursorSupport cursor) {
        this.errorPL = errorPL;
        this.cursor = cursor;
    }
    public ErrorPL getErrorPL() {
        return errorPL;
    }
    public void setErrorPL(ErrorPL errorPL) {
        this.errorPL = errorPL;
    }
    public RefCursorSupport getCursor() {
        return cursor;
    }
    public void setCursor(RefCursorSupport cursor) {
        this.cursor = cursor;
    }
    
    
}
