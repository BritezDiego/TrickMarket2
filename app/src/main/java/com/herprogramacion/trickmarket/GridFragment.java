package com.herprogramacion.trickmarket;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.pe.trickmarket.R;

import in.srain.cube.views.GridViewWithHeaderAndFooter;

/**
 * Un fragmento que contiene una grilla de productos
 */
public class GridFragment extends Fragment {
    /**
     * Argumento que representa el número sección al que pertenece
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Creación prefabricada de un {@link GridFragment}
     */
    public static GridFragment newInstance(int sectionNumber) {
        GridFragment fragment = new GridFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;

    }



    public GridFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Obtención del grid view
        GridViewWithHeaderAndFooter grid =
                (GridViewWithHeaderAndFooter) rootView.findViewById(R.id.gridview);

        // Inicializar el grid view
        setUpGridView(grid);

        return rootView;
    }

    /**
     * Infla el grid view del fragmento dependiendo de la sección
     *
     * @param grid Instancia del grid view
     */
    private void setUpGridView(GridViewWithHeaderAndFooter grid) {
        int section_number = getArguments().getInt(ARG_SECTION_NUMBER);
        switch (section_number) {
            case 1:
                grid.addHeaderView(createHeaderView(1, infomotos.getBajaj()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getBajaj()));
                break;
            case 2:
                grid.addHeaderView(createHeaderView(2, infomotos.getBeta()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getBeta()));
                break;
            case 3:
                grid.addHeaderView(createHeaderView(3, infomotos.getBrava()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getBrava()));
                break;
            case 4:
                grid.addHeaderView(createHeaderView(4, infomotos.getCorven()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getCorven()));
                break;
            case 5:
                grid.addHeaderView(createHeaderView(5, infomotos.getGuerrero()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getGuerrero()));
                break;
            case 6:
                grid.addHeaderView(createHeaderView(1, infomotos.getGilera()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getGilera()));
                break;
            case 7:
                grid.addHeaderView(createHeaderView(3, infomotos.getHonda()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getHonda()));
                break;
            case 8:
                grid.addHeaderView(createHeaderView(2, infomotos.getJawa()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getJawa()));
                break;
            case 9:
                grid.addHeaderView(createHeaderView(3, infomotos.getJianshe()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getJianshe()));
                break;
            case 10:
                grid.addHeaderView(createHeaderView(3, infomotos.getKawasaki()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getKawasaki()));
                break;
            case 12:
                grid.addHeaderView(createHeaderView(2, infomotos.getKeller()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getKeller()));
                break;
            case 13:
                grid.addHeaderView(createHeaderView(0, infomotos.getKTM()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getKTM()));
                break;
            case 14:
                grid.addHeaderView(createHeaderView(2, infomotos.getKymco()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getKymco()));
                break;
            case 15:
                grid.addHeaderView(createHeaderView(4, infomotos.getMondial()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getMondial()));
                break;
            case 16:
                grid.addHeaderView(createHeaderView(5, infomotos.getMotomel()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getMotomel()));
                break;
            case 17:
                grid.addHeaderView(createHeaderView(1, infomotos.getSuzuki()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getSuzuki()));
                break;
            case 18:
                grid.addHeaderView(createHeaderView(2, infomotos.getYamaha()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getYamaha()));
                break;
            case 19:
                grid.addHeaderView(createHeaderView(3, infomotos.getZanella()));
                grid.setAdapter(new GridAdapter(getActivity(), infomotos.getZanella()));
                break;
        }
    }

    /**
     * Crea un view de cabecera para mostrarlo en el principio del grid view.
     *
     * @param position Posición del item que sera el grid view dentro de {@code items}
     * @param items    Array de productos
     * @return Header View
     */
    private View createHeaderView(int position, motos[] items) {

        View view;

        LayoutInflater inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.grid_header, null, false);

        motos item = items[position];

        // Seteando Imagen
        ImageView image = (ImageView) view.findViewById(R.id.imagen);
        Glide.with(image.getContext()).load(item.getIdThumbnail()).into(image);

        // Seteando Nombre
        TextView name = (TextView) view.findViewById(R.id.nombre);
        name.setText(item.getNombre());

        // Seteando Descripción
        TextView descripcion = (TextView) view.findViewById(R.id.descripcion);
        descripcion.setText(item.getDescripcion());



        return view;
    }
}
