from django.shortcuts import render
from .models import Gguuser

# Create your views here.
def index(request):
    gguusers = Gguuser.objects.all()
    gguuserdic = {0:'blank'}

    for gguuser in gguusers:
        gguuserdic.setdefault(gguuser.stunum,gguuser.name)

    return render(request, 'ggumvc/public/index.html',gguuserdic)