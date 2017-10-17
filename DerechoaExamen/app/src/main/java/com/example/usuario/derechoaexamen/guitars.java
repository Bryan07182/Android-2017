package com.example.usuario.derechoaexamen;


public class guitars {

     String nombre;
     int idDrawable;

    public guitars(String nombre, int idDrawable) {

        this.nombre = nombre;
        this.idDrawable = idDrawable;

    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static guitars[] ITEMS = {

            new guitars("Gibson Les Paul Tribute T 2017 Electric Guitar", R.drawable.gib1),
            new guitars("Gibson 2017 Les Paul Standard T Electric Guitar", R.drawable.gib2),
            new guitars("Gibson 2017 Les Paul Faded T Electric Guitar", R.drawable.gib3),
            new guitars("Gibson 2017 SG Standard Gold Series Electric Guitar", R.drawable.gib4),
            new guitars("Gibson 2017 Les Paul Classic T Electric Guitar", R.drawable.gib5),
            new guitars("Gibson Les Paul Traditional Pro IV Electric Guitar", R.drawable.gib6),
            new guitars("Gibson 2016 Les Paul Standard T Electric Guitar", R.drawable.gib7),
            new guitars("Gibson Les Paul Tribute T 2017 Electric Guitar with Soft Case", R.drawable.gib8),
            new guitars("Epiphone Limited Edition Les Paul Custom PRO Electric Guitar", R.drawable.gib9),
            new guitars("Epiphone Les Paul 100 Electric Guitar", R.drawable.gib10),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return guitars
     */
    public static guitars getItem(int id) {
        for (guitars item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
