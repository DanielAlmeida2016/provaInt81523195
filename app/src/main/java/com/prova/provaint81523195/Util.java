package com.prova.provaint81523195;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

/**
 * Copied by Daniel Almeida on 29/09/17.
 * RA 81523195
 */

public class Util {

    /**
     * Copied by Daniel Almeida on 29/09/2017.
     * RA 81523195
     */
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
