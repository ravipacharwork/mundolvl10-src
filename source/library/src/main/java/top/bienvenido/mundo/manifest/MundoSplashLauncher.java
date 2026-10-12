package top.bienvenido.mundo.manifest;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import top.bienvenido.date_24323.AbstractC0065x6082d607;
import top.bienvenido.date_24323.a6;
import top.bienvenido.date_24323.b6;
import top.bienvenido.date_24323.n6;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/manifest/MundoSplashLauncher.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/bienvenido/mundo/manifest/MundoSplashLauncher;", "Landroid/app/Activity;", "<init>", "()V", "mundo"}, xi = 48)
public final class MundoSplashLauncher extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m701(getIntent());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m701(intent);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m701(Intent intent) {
        a6 a6Var;
        try {
            String stringExtra = intent.getStringExtra("mundo_base_string");
            if (stringExtra == null || StringsKt.isBlank(stringExtra)) {
                finish();
                return;
            }
            try {
                a6Var = (a6) b6.f26.m385(stringExtra.hashCode());
            } catch (Exception unused) {
                a6Var = null;
            }
            if (a6Var != null) {
                if (AbstractC0065x6082d607.f503) {
                    getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
                if (a6Var.f7 == null) {
                    getWindow().getDecorView().setBackground(a6Var.f6);
                } else {
                    a6 a6Var2 = a6Var;
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
                    Triple triple = a6Var2.f7;
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    Integer num = (Integer) triple.getSecond();
                    Integer num2 = (Integer) triple.getThird();
                    a6 a6Var3 = a6Var;
                    ImageView imageView = new ImageView(this);
                    int i = iApplyDimension * 14;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                    layoutParams.gravity = 17;
                    imageView.setLayoutParams(layoutParams);
                    Drawable drawable = a6Var3.f6;
                    imageView.setImageDrawable(drawable);
                    if (drawable instanceof Animatable) {
                        ((Animatable) drawable).start();
                    }
                    if (num2 != null && !Intrinsics.areEqual(num2, num) && num2.intValue() != 0) {
                        imageView.setBackgroundColor(num2.intValue());
                    }
                    frameLayout.addView(imageView);
                    Drawable drawable2 = (Drawable) triple.getFirst();
                    if (drawable2 != null) {
                        View view = new View(this);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iApplyDimension * 10, iApplyDimension * 4);
                        layoutParams2.gravity = 81;
                        layoutParams2.bottomMargin = iApplyDimension * 3;
                        view.setLayoutParams(layoutParams2);
                        view.setBackground(drawable2);
                        if (AbstractC0065x6082d607.f500) {
                            view.forceHasOverlappingRendering(false);
                        }
                        frameLayout.addView(view);
                    }
                    if (num != null) {
                        frameLayout.setBackgroundColor(num.intValue());
                    } else {
                        frameLayout.setBackground(getWindow().getDecorView().getBackground());
                    }
                    setContentView(frameLayout);
                }
            }
            String stringExtra2 = intent.getStringExtra("mundo_base_bundle");
            getWindow().getDecorView().findViewById(R.id.content).post(() -> {
                m700(r1, r2);
            });
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m700(String str, String str2) {
        n6 n6Var = n6.f241;
        if (str2 == null || str2.length() == 0) {
            str2 = "0";
        }
        n6Var.getClass();
        n6.m383((ActivityInfo) null, str, str2);
    }
}
