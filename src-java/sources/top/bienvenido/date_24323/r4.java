package top.bienvenido.date_24323;

import android.content.Context;
import android.os.Build;
import android.util.JsonWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.ArrayIteratorKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/r4.class */
public abstract class r4 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m441(Thread thread, Throwable th) {
        try {
            File fileM428 = q1.m428(b3.f17.getCacheDir(), "mundo_crash");
            fileM428.mkdirs();
            File[] fileArrListFiles = fileM428.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 10) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            File fileM429 = q1.m428(fileM428, System.currentTimeMillis() + "_mundo_bugreport.json");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
                try {
                    JsonWriter jsonWriter = new JsonWriter(printWriter);
                    try {
                        jsonWriter.beginObject();
                        JsonWriter jsonWriterValue = jsonWriter.name("fingerprint").value(Build.FINGERPRINT.toString()).name("manufacture").value(Build.MANUFACTURER.toString()).name("model").value(Build.MODEL.toString()).name("androidver").value(Integer.valueOf(Build.VERSION.SDK_INT).toString()).name("codename").value(Build.VERSION.CODENAME.toString()).name("display").value(Build.DISPLAY.toString()).name("cpuabi").value(ArraysKt.contentDeepToString(Build.SUPPORTED_ABIS).toString()).name("apppkg").value(f4.f92.toString()).name("appprocess").value(f4.f93.toString()).name("appstatus").value((f4.f96 ? "internal" : "clone").toString());
                        Context context = b3.f17;
                        JsonWriter jsonWriterValue2 = jsonWriterValue.name("hostpkg").value(context.getPackageName().toString());
                        String str = context.getApplicationInfo().nativeLibraryDir;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        jsonWriterValue2.name("hostnative").value(str2.toString()).name("thread").value(thread.toString()).name("stack").value(ExceptionsKt.stackTraceToString(th).toString());
                        jsonWriter.name("threadstacks");
                        jsonWriter.beginArray();
                        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(entry.getKey().toString());
                            jsonWriter.beginArray();
                            Iterator it = ArrayIteratorKt.iterator(entry.getValue());
                            while (it.hasNext()) {
                                jsonWriter.value(((StackTraceElement) it.next()).toString());
                            }
                            jsonWriter.endArray();
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23) {
                            jsonWriter.name("preview").value(Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT).toString());
                            if (i >= 31) {
                                jsonWriter.name("soc").value(Build.SOC_MODEL.toString());
                                jsonWriter.name("socmanufacture").value(Build.SOC_MANUFACTURER.toString());
                            }
                        }
                        jsonWriter.endObject();
                        CloseableKt.closeFinally(jsonWriter, (Throwable) null);
                        CloseableKt.closeFinally(printWriter, (Throwable) null);
                        String str3 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                        CloseableKt.closeFinally(byteArrayOutputStream, (Throwable) null);
                        FilesKt.writeText$default(fileM429, str3, (Charset) null, 2, (Object) null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(th3, th2);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(th5, th4);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    CloseableKt.closeFinally(th7, th6);
                    throw th6;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m440() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler((v1, v2) -> {
            m439(r0, v1, v2);
        });
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m439(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) throws Throwable {
        m441(thread, th);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        throw th;
    }
}
