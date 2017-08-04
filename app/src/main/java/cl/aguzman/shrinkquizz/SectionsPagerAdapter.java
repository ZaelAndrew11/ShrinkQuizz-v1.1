package cl.aguzman.shrinkquizz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return PartyFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "PARTY";
            case 1:
                return "LUCKY";
            case 2:
                return "MATCH";
        }
        return null;
    }
}
