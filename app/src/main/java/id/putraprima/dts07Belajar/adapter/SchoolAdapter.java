package id.putraprima.dts07Belajar.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import id.putraprima.dts07Belajar.R;
import id.putraprima.dts07Belajar.models.School;

public class SchoolAdapter extends BaseQuickAdapter<School,BaseViewHolder> {
    public SchoolAdapter(int layoutResId) {
        super(layoutResId);
    }

    public SchoolAdapter(int layoutResId, @Nullable List<School> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, School school) {
        baseViewHolder.setText(R.id.namaSekolah,school.getName());
    }
}
