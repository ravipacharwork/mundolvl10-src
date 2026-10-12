package top.bienvenido.date_24323;

import android.app.job.IJobCallback;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/y5.class */
public abstract class y5 extends JobService {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final p2 f423 = new p2("extras");

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final u2 f424;

    public y5() {
        u2 s2Var;
        r2 r2Var;
        if (AbstractC0065x6082d607.f508) {
            try {
                Field declaredField = JobParameters.class.getDeclaredField("callback");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var = u2.f337;
            }
        } else {
            s2Var = u2.f337;
        }
        this.f424 = s2Var;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final JobService m575(ComponentName componentName, f0 f0Var) {
        IBinder iBinderMo82 = f0Var.mo82(componentName, f4.f94);
        if (iBinderMo82 == null) {
            return null;
        }
        h6.f130.getClass();
        Object obj = h6.f1463.get(iBinderMo82);
        if (obj instanceof JobService) {
            return (JobService) obj;
        }
        return null;
    }

    @Override // android.app.job.JobService
    public final void onNetworkChanged(JobParameters jobParameters) {
        JobService jobServiceM576 = m576(jobParameters);
        if (jobServiceM576 != null) {
            jobServiceM576.onNetworkChanged(jobParameters);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobService jobServiceM576 = m576(jobParameters);
        if (jobServiceM576 != null) {
            return jobServiceM576.onStartJob(jobParameters);
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        JobService jobServiceM576 = m576(jobParameters);
        if (jobServiceM576 != null) {
            return jobServiceM576.onStopJob(jobParameters);
        }
        return true;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2;
        if (intent != null) {
            try {
                intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            } catch (Exception unused) {
                return 2;
            }
        } else {
            intent2 = null;
        }
        if (intent2 == null) {
            return 2;
        }
        Intent intent3 = intent2;
        w3 w3Var = w3.f375;
        String stringExtra = intent3.getStringExtra("user");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "0";
        }
        w3Var.mo76xaa30c2c7(intent2, str);
        return 2;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final JobService m576(JobParameters jobParameters) {
        if (jobParameters == null) {
            return null;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null) {
                return null;
            }
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(extras.getString("mundo_base_string", ""));
            if (componentNameUnflattenFromString == null) {
                return null;
            }
            PersistableBundle persistableBundle = extras.getPersistableBundle("mundo_base_bundle");
            if (persistableBundle == null) {
                return null;
            }
            if (AbstractC0065x6082d607.f508) {
                IBinder iBinder = (IBinder) this.f424.mo393(jobParameters);
                if (iBinder != null) {
                    this.f424.mo394(jobParameters, new n4(iBinder, (IInterface) c1.m95(IJobCallback.Stub.asInterface(iBinder), o.f256)));
                }
            }
            JobService jobService = (JobService) e4.f76xaa30c2c7.m222((v1) -> {
                return m575(r1, v1);
            });
            if (jobService == null) {
                return null;
            }
            this.f423.f270.mo394(jobParameters, persistableBundle);
            return jobService;
        } catch (Throwable unused) {
            return null;
        }
    }
}
